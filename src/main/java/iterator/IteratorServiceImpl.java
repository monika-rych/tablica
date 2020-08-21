package iterator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class IteratorServiceImpl implements IteratorService {

    @Override
    public void removeElementsFromCollection() {
        //list iterator przyklad na list iterator
        List<String> names = new ArrayList();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }
    }
}
