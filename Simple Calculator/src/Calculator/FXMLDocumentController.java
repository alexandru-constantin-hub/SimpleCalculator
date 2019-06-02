/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author cstuser
 */
public class FXMLDocumentController implements Initializable {
     
  
   @FXML
   private Label result;
   
   @FXML
   private Button one;
   
   @FXML
   private Button two;
   
   @FXML
   private Button three;
   
   @FXML
   private Button four;
   
   @FXML
   private Button five;
   
   @FXML
   private Button six;
   
   @FXML
   private Button seven;
   
   @FXML
   private Button eight;
   
   
   @FXML
   private Button nine;
   
   @FXML
   private Button plus;
   
   @FXML
   private Button minus;
   
   @FXML
   private Button multiply;
   
    @FXML
   private Button divided;
    
   String resultfinal="";
   int number1 = 0;
   int number2 = 0;
   int total = 0;
   String sign = "";
   
   
   

   

    
   @FXML
    private void one(ActionEvent event) {
       resultfinal +=1;
       result.setText(resultfinal);
       
    }
    
    @FXML
    private void two(ActionEvent event) {
      resultfinal +=2;
      result.setText(resultfinal);
        
    }
    @FXML
     private void three(ActionEvent event) {
        resultfinal +=3;
        result.setText(resultfinal);
    }
    @FXML 
     private void four(ActionEvent event) {
        resultfinal +=4;
        result.setText(resultfinal);
    } 
     @FXML
     private void five(ActionEvent event) {
         resultfinal +=5;
         result.setText(resultfinal);
    }
     @FXML
     private void six(ActionEvent event) {
        resultfinal +=6;
        result.setText(resultfinal);
    }
     @FXML
     private void seven(ActionEvent event) {
        resultfinal +=7;
        result.setText(resultfinal);
    }
     @FXML
      private void eight(ActionEvent event) {
        resultfinal +=8;
        result.setText(resultfinal);
    }
      
     @FXML 
     private void nine(ActionEvent event) {
        resultfinal += 9;
        result.setText(resultfinal);
    }
     
     @FXML 
     private void zero(ActionEvent event) {
        resultfinal += 0;
        result.setText(resultfinal);
    }
     
     @FXML
    private void plus(ActionEvent event) {
       if(number1==0){
         number1= Integer.parseInt(resultfinal);
         resultfinal="";
         sign="+";
       } else {
          sign="+";
          number2= Integer.parseInt(resultfinal);
        switch(sign){
            case "-": total=number1-number2;break;
            case "+": total=number1+number2;break;
            case "*": total=number1*number2;break;
            case "/": total=number1/number2;break;                  
        }
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
        resultfinal="";
        
       }
          
     
    
        
                
    }
    @FXML
    private void minus(ActionEvent event) {
       if(number1==0){
         number1= Integer.parseInt(resultfinal);
         resultfinal="";
         sign="-";
       } else {
          sign = "-";
          number2= Integer.parseInt(resultfinal);
        switch(sign){
            case "-": total=number1-number2;break;
            case "+": total=number1+number2;break;
            case "*": total=number1*number2;break;
            case "/": total=number1/number2;break;                  
        }
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
        resultfinal="";
        
       }
        
    }
    @FXML
     private void multiply(ActionEvent event) {
       if(number1==0){
         number1= Integer.parseInt(resultfinal);
         resultfinal="";
         sign="*";
       } else {
          sign = "*";
           number2= Integer.parseInt(resultfinal);
        switch(sign){
            case "-": total=number1-number2;break;
            case "+": total=number1+number2;break;
            case "*": total=number1*number2;break;
            case "/": total=number1/number2;break;                  
        }
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
        resultfinal="";
        
       }
    }
     @FXML
     private void divided(ActionEvent event) {
       if(number1==0){
         number1= Integer.parseInt(resultfinal);
         resultfinal="";
         sign="/";
       } else {
          sign = "/";
           number2= Integer.parseInt(resultfinal);
        switch(sign){
            case "-": total=number1-number2;break;
            case "+": total=number1+number2;break;
            case "*": total=number1*number2;break;
            case "/": total=number1/number2;break;                  
        }
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
        resultfinal="";
        
       }
    }
     
     @FXML
     private void equal(ActionEvent event) {
     if(number2==0) {    
     number2= Integer.parseInt(resultfinal);
        switch(sign){
            case "-": total=number1-number2;break;
            case "+": total=number1+number2;break;
            case "*": total=number1*number2;break;
            case "/": total=number1/number2;break;                  
        }
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
     } else
        result.setText(Integer.toString(total));
        number1=total;
        number2=0;
         
        
    }
     
     
     @FXML
     private void cancel(ActionEvent event) {
        resultfinal = "";
        result.setText("");
        total=0;
        number1=0;
        number2=0;
        sign = "";
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
