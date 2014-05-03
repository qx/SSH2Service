/**
 *
 */
package com.fullwish.action;

import java.util.ArrayList;
import java.util.List;

import com.fullwish.mode.ProductServer;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fullwish
 */
@Controller
public class TestJson2 extends ActionSupport {
    /**
     *
     */
    private static final long serialVersionUID = -6904551088211709647L;


    public String status;


    public List<ProductServer> result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ProductServer> getResult() {
        return result;
    }

    public void setResult(List<ProductServer> result) {
        this.result = result;
    }

    @SuppressWarnings("unchecked")
    public String execute() {
//        map.put("name", "yeeku");
        // return Action.SUCCESS;
//        setMap(map);
        ArrayList<ProductServer> ap = new ArrayList<ProductServer>();
        ap.add(new ProductServer());
        setStatus("false");
        setResult(ap);


        return SUCCESS;
     /*   {"newName":"custom","productId":null,"productImg":null,"productName":null,"ints":[10,20],"map":{"name":"yeeku"}}*/
    }

//    public String getTestField() {
//        return testField;
//    }



//    public void setTestField(String testField) {
//        this.testField = testField;
//    }
}
