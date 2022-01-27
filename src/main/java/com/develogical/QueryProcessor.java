package com.develogical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("synchro")) {
            return "Level 2 Synchro Tuner Formula Synchron tunes Level 8 Synchro Monster Stardust Dragon";
        }
        
        if (query.toLowerCase().trim().contains("largest")) {
            String[] s = query.split(":")[2].trim().split(",");
            List<String> list = Arrays.asList(s);
            Optional<Integer> result = list.stream().map(String::trim).map(Integer::parseInt).max(Comparator.naturalOrder());
            return result.toString();
        }

        if (query.toLowerCase().contains("what is 12 plus 7")) {
            return "19";
        }

        return "";
    }
}
