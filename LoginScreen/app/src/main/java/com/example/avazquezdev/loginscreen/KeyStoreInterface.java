package com.example.avazquezdev.loginscreen;

public interface KeyStoreInterface {
    public boolean createNewKey(String alias);
    public void deleteKey(String alias);
    public String encryptString(String alias, String password);
    public String decryptString(String alias, String password);
    public boolean existAlias(String alias);
}
