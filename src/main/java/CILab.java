public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        boolean upper=false;
        if(this.myString==""){return false;}
        int caps=0;
        for(int i=0; i<this.myString.length(); i++){
            if(Character.isUpperCase(this.myString.charAt(i))){
                caps++;
            }
        }
        if(caps==0||caps==this.myString.length()){
            return true;
        }
        if(caps==1&&Character.isUpperCase(this.myString.charAt(0))){
            return true;
        }
        return false;
    }

}

