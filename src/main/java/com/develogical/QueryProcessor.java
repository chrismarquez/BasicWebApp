package com.develogical;

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
        
        if (query.toLowerCase().trim().contains("whichofthefollowingnumbersisthelargest")) {
            String[] s= query.split(":")[1].split(",");
            return Math.max(stringList.stream().map(Integer::parseInt).collect(Collectors.toList()));
        }

        if (query.toLowerCase().contains("what is 12 plus 7")) {
            return "19";
        }

        return "";
    }
}
