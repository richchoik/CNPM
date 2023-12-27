
package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.entity.NopPhi;
import com.hust.soict.cnpm.group24.model.dao.NopPhiDAO;


/**
 *
 * @author DELL
 */
public class NopPhiController {
    public static boolean themNopPhi(NopPhi nopPhi){
       if(NopPhiDAO.addNopPhi(nopPhi) > 0) return true;
       else return false;
    }
    public static boolean suaNopPhi(NopPhi nopPhi){
        if(NopPhiDAO.mdfNopPhi(nopPhi) > 0) return true;
        else return false;
    }
}
