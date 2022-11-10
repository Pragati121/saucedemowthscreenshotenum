package Enum;
public enum LoginEnum {
    Username ("user-name"),
    Password("password"),
    Login("login-button"),
    OpenSidebar("react-burger-menu-btn");
    private String name;
    LoginEnum (String name)
    {
        this.name = name;
    }
    public String getResourcesName()
    {
        return name;
    }
}

