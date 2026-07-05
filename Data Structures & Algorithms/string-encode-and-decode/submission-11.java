class Solution {
    public String encode(List<String> strs) {
        StringBuilder enCodedString = new StringBuilder();
        for (String str : strs) {
            enCodedString.append(str.length() + "$" + str);
        }
        System.out.println(enCodedString);
        return enCodedString.toString();
    }

    public List<String> decode(String str) {
        int initialIndex = 0;
        List<String> arr = new ArrayList<>();
        System.out.println(str);
        // while (initialIndex <str.length()){
        //     int stringPart = Character.getNumericValue(str.charAt(initialIndex));
        //     System.out.println("string part" + initialIndex + " "+str.charAt(initialIndex));
        //     System.out.println(stringPart);
        //     initialIndex += 2;
        //     String currentString = "";
        //     while(stringPart > 0){
        //         currentString += String.valueOf(str.charAt(initialIndex));
        //         stringPart -= 1;
        //         initialIndex += 1;
        //     }
        //     arr.add(currentString);
        //     currentString = "";
        // }
        while (initialIndex < str.length()) {
            int secondIndex = initialIndex;
            System.out.println(str.charAt(secondIndex));
            System.out.println(String.valueOf(str.charAt(secondIndex)));
            System.out.println((secondIndex));
            while (!String.valueOf(str.charAt(secondIndex)).equals("$")) {
                secondIndex++;
            }
            int length = Integer.parseInt(str.substring(initialIndex, secondIndex));
            secondIndex++;
            String currentString = str.substring(secondIndex, secondIndex + length);
            arr.add(currentString);
            initialIndex = secondIndex + length;
        }

        return arr;
    }
}
