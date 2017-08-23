package com.github.tsauvajon.hrjava.java.introduction.javaIntToString;

import java.security.Permission;

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }
}