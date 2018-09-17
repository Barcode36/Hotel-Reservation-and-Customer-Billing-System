/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import dao.RoomTypeDao;
import entity.Room;
import entity.Roomtype;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Pagination;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Tharana
 */
public class RoomTypeManagementUIController implements Initializable {

    //<editor-fold defaultstate="collapsed" desc="FXML-Data">
    @FXML
    private JFXTextField txtRoomType;
    @FXML
    private JFXTextField txtArea;
    @FXML
    private JFXTextField txtRoomTypePrice;
    @FXML
    private Pagination pagination;
    @FXML
    private TableView<Roomtype> tblRoomType;
    @FXML
    private JFXButton btnSearchClear;
    @FXML
    private JFXButton btnAdd;
    @FXML
    private JFXButton btnDelete;
    @FXML
    private JFXButton btnClear;
    @FXML
    private JFXButton btnUpdate;
    @FXML
    private JFXTextField txtSearchRoomType;
    @FXML
    private TableColumn<Roomtype, String> colRoomType;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun1;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun2;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun3;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun4;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun5;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun6;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun7;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun8;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun9;
    @FXML
    private TableColumn<Roomtype, ImageView> colFun10;
    @FXML
    private JFXCheckBox cbxFun1;
    @FXML
    private JFXCheckBox cbxFun6;
    @FXML
    private JFXCheckBox cbxFun4;
    @FXML
    private JFXCheckBox cbxFun3;
    @FXML
    private JFXCheckBox cbxFun2;
    @FXML
    private JFXCheckBox cbxFun8;
    @FXML
    private JFXCheckBox cbxFun7;
    @FXML
    private JFXCheckBox cbxFun9;
    @FXML
    private JFXCheckBox cbxFun5;
    @FXML
    private JFXCheckBox cbxFun10;
    @FXML
    private TextArea txtDescription;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Form-Data">
    Roomtype roomtype;
    Roomtype oldRoomtype;
    
    String initial;
    String valid;
    String invalid;
    String updated;
    
    int page;
    int row;
    
    BigDecimal roomTypeCost;
//</editor-fold>
 


   
}