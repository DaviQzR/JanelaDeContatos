import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Contatos extends Application {
   
    @Override
    public void start(Stage stage) throws Exception {
       GridPane pane = new GridPane();
       Scene scn = new Scene(pane, 350, 180);

       stage.setScene(scn);
       stage.setTitle("Agenda de Contatos");

       Label lblId = new Label("Id:");
       Label lblNome = new Label ("Nome:");
       Label lblTel = new Label ("Telefone:");

       TextField txtId = new TextField();
       TextField txtNome = new TextField();
       TextField txtTel = new TextField();

       Button btnSalvar = new Button("Salvar");
       Button btnPesquisar = new Button("Pesquisar");

       GridPane.setConstraints(lblId, 0, 0);
       GridPane.setConstraints(txtId, 1, 0);

       GridPane.setConstraints(lblNome, 0, 1);
        GridPane.setConstraints(txtNome, 1, 1);
        
        GridPane.setConstraints(lblTel, 0, 2);
        GridPane.setConstraints(txtTel, 1, 2);
        
        GridPane.setConstraints(btnSalvar, 0, 3);
        GridPane.setConstraints(btnPesquisar, 1, 3);
        
        pane.getChildren().addAll(lblId, lblNome, lblTel, txtId, txtTel, txtNome, btnSalvar, btnPesquisar);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }

       
}
