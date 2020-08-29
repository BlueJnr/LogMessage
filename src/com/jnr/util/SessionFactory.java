/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr.util;

import com.jnr.service.SessionFile;
import com.jnr.service.SessionService;
import static com.jnr.util.Util.CONSOLE;
import static com.jnr.util.Util.DATABASE;
import static com.jnr.util.Util.FILE;

/**
 *
 * @author 51976
 */
public class SessionFactory {

    private SessionFactory() {
    }

    public static SessionFactory getInstance() {
        return SessionFactoryHolder.INSTANCE;
    }

    private static class SessionFactoryHolder {

        private static final SessionFactory INSTANCE = new SessionFactory();
    }

    public SessionService getSession(int tipo) {
        SessionService service = null;
        switch (tipo) {
            case CONSOLE:
                service = new SessionFile();
                break;
            case FILE:
                service = new SessionFile();
                break;
            case DATABASE:
                service = new SessionFile();
                break;
        }
        return service;
    }
}
