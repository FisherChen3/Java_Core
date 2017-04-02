package guice.learning.google.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

import java.util.Properties;

public class TestPropertiesInjection {
    private final String myprop;

    @Inject
    public TestPropertiesInjection(@Named("myprop") String myprop) {
        this.myprop = myprop;
    }

    public String getMyprop() {
        return myprop;
    }

    public static void main(String[] args) {
        AbstractModule module = new AbstractModule() {
            @Override
            protected void configure() {
                Properties defaults = new Properties();
                defaults.setProperty("myprop", "default");
                Properties props = new Properties(defaults);
//                    props.load(new FileInputStream("my.properties"));
                Names.bindProperties(binder(), props);

            }
        };

        final TestPropertiesInjection instance = Guice.createInjector(module).getInstance(TestPropertiesInjection.class);
        System.out.println("myprop = " + instance.getMyprop());
    }
}