package com.develogical;


public static boolean isPrime(int n) {
if (n<= 1) {
return false;
}
for (int i = 2; i< n; i++) {
if (n % i == 0) {
return false;
}
}
return true;
}
}


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
        
        if (query.toLowerCase().contains("whichyearwastheresamayfirstelected")) {
            return "2016";
        }

        if (query.toLowerCase().contains("synchro")) {
            return "Level 2 Synchro Tuner Formula Synchron tunes Level 8 Synchro Monster Stardust Dragon";
        }
        
        if (query.toLowerCase().trim().contains("whichofthefollowingnumbersisthelargest")) {
            String[] s= query.split(":")[1].split(",");
            return Math.max(stringList.stream().map(Integer::parseInt).collect(Collectors.toList()));
        }

        if (query.toLowerCase().contains("what is")) {
            string[] s= query.split("is")[1].split(" plus ");
            return Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
        }

        if (query.toLowerCase().contains("which of the following numbers is both a square and a cube")) {
            string[] s= query.split(":")[1].split(",");
//            TODO: Make this work
            return max(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
        }


        return "";
    }
}
