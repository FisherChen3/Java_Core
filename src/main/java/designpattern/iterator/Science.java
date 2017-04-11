package designpattern.iterator;

import java.util.LinkedList;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Science implements ISubject {
    private LinkedList<String> subjects;
    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }
    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }
    //Containing the ScienceIterator
    public class ScienceIterator implements IIterator {
        private LinkedList<String> subjects;
        private int position;
        public ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }
        public void First() {
            position = 0;
        }
        public String Next() {
            return subjects.get(position++);
        }
        public Boolean IsDone() {
            return position >= subjects.size();
        }
        public String CurrentItem() {
            return subjects.get(position);
        }
    }
}
