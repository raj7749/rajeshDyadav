package rdyexcel2txt_v2;

import com.rajeshDyadav.file.xml.InputExcel01;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class homeController implements Initializable {
    
    @FXML
    TextField txtInputFile, txtRowNo;
    
    @FXML
    Button btnInputFile, btnProcess;
    
    @FXML
    Label lblStatus;
        
    @FXML
    private void processOperation(ActionEvent event) {        
        lblStatus.setText("");
        InputExcel01 inputExcel01 = new InputExcel01();
        String xmlFilePath = "ColumnNames.xml";
        String inputFilePath = txtInputFile.getText().toString();            
        int rowNo = 0;
        try {
            rowNo = Integer.parseInt(txtRowNo.getText());        
        } catch (NumberFormatException e) {
            lblStatus.setText("Please enter only numbers"); 
            throw new NumberFormatException();
        }
        if (txtInputFile.getText().length() > 0 && txtRowNo.getText().length() > 0) {
            lblStatus.setText("Please wait!!! this may take time");        
            lblStatus.setText(inputExcel01.excelOperation(xmlFilePath, inputFilePath, "RDY_test1.txt", rowNo));
        } else {
            lblStatus.setText("Incorrect Details!!! Try Again");
        }        
        txtInputFile.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
