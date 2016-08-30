package beans;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class MeiboBean {

    private Integer number;
    private String name;

    public String next() {
        
        //FacesContext facesContext = FacesContext.getCurrentInstance();
        //facesContext.getExternalContext().getFlash().put("number", this.number);
        //facesContext.getExternalContext().getFlash().put("name", this.name);
        
        System.out.println("★number=" + this.number + "/ name=" + this.name);
        //return "output.xhtml?faces-redirect=true"; // 次に表示するウェブページ
        return "output.xhtml";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
