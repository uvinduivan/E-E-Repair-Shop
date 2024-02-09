package dto.tm;

import com.jfoenix.controls.JFXButton;

public class CustomerTm {

    private String id;
    private String name;
    private String mail;

    private JFXButton btn;

    public CustomerTm() {
    }

    public CustomerTm(String id, String name, String mail, JFXButton btn) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.btn = btn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public JFXButton getBtn() {
        return btn;
    }

    public void setBtn(JFXButton btn) {
        this.btn = btn;
    }
}
