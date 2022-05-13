import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class selenium {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();

        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> in=new ArrayList<>();

        name.add("Aqua");
        name.add("Nicotinamide");




        //for (int i = 0; i < name.size(); i++) {
          //  System.out.println("name : "+name.get(i));}



        for (int i = 0; i < name.size(); i++) {
       in.add(IcerikGetir(name.get(i),driver));
        }

       yazdir(name,in);

    }

   public static String IcerikGetir(String name, WebDriver driver){



        driver.get("https://www.cosdna.com/eng/stuff.php");



        WebElement nameElemen=driver.findElement(By.name("q"));

        nameElemen.sendKeys(name);
        WebElement btnname=driver.findElement(By.className("btn"));
        btnname.click();
        WebElement btns=driver.findElement(By.className("d-block"));
        btns.click();
        WebElement txt=driver.findElement(By.className("linkb1"));


        return  txt.getText();

    }

    static void yazdir(ArrayList<String> value1,ArrayList<String> value2){

        for (int i = 0; i <value1.size(); i++) {

            System.out.println("Name : "+ value1.get(i)+"    " +"İn : "+value2.get(i));

        }


    }
}



