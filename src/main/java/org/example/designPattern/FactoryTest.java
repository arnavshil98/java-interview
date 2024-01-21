package org.example.designPattern;

interface Os{
    public void osCofig();
}

class Windows implements Os{

    @Override
    public void osCofig() {
        System.out.println("windows os");
    }
}

class Mac implements Os{

    @Override
    public void osCofig() {
        System.out.println("mac os");
    }
}
class Linux implements Os{

    @Override
    public void osCofig() {
        System.out.println("linux os");
    }
}


class FactoryDesign{

    public Os getInstance(String osType){
        if(osType.equalsIgnoreCase("windows")){
            return new Windows();
        }
        else if(osType.equalsIgnoreCase("mac")){
            return new Mac();
        }else {
            return new Linux();
        }
    }

}

public class FactoryTest {
    public static void main(String[] args) {
        FactoryDesign factoryDesign = new FactoryDesign();
        factoryDesign.getInstance("windows").osCofig();
    }
}
