package trivera.cdi.util;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2017 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class BeanManagerUtil {

    private static BeanManagerUtil instance;
    private BeanManager beanManager;

    private BeanManagerUtil() {  

    }
    
    public static BeanManagerUtil getInstance(){
    	if(instance == null){
    		instance = new BeanManagerUtil();
    		instance.init();
    	}
    	return instance;
    }
    
    private void init(){
    	Weld weld = new Weld();
    	WeldContainer container = weld.initialize();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                weld.shutdown();
            }
        });
        this.beanManager = container.getBeanManager();
    }

    
	public <T> T getBean(Class<T> type, Annotation... qualifiers) {
		if (type == null) {
			throw new IllegalArgumentException("CDI Bean type cannot be null");
		}

		Set<Bean<?>> beans = beanManager.getBeans(type, qualifiers);
		if (beans.isEmpty()) {
			throw new RuntimeException("Could not locate a bean of type "
					+ type.getName());
		}
		Bean<?> bean = beanManager.resolve(beans);
		CreationalContext<?> context = beanManager
				.createCreationalContext(bean);
		@SuppressWarnings("unchecked")
		T result = (T) beanManager.getReference(bean, bean.getBeanClass(),
				context);
		
		return result;
	}
}
