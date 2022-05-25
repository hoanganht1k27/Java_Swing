import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("hoanganht1k27", "lkl");
        logininfo.put("lkl", "lkl");
        logininfo.put("test", "lkl");
    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
