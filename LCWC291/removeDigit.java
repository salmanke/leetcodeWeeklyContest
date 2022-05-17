public String removeDigit(String number, char digit) {
        
        ArrayList<String> li=new ArrayList<>();
        
        int n=number.length();
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                String s=number.substring(0,i)+number.substring(i+1);
                li.add(s);
            }
        }
        Collections.sort(li);
        
        return li.get(li.size()-1);
    }