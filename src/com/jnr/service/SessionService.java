/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr.service;

import com.jnr.model.Log;

/**
 *
 * @author 51976
 */
public interface SessionService {
    
    public String getMessageText(Log log);
    public boolean saveMessageText(Log log);
}
