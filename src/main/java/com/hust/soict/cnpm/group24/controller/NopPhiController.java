
package com.hust.soict.cnpm.group24.controller;

import com.hust.soict.cnpm.group24.model.entity.NopPhi;
import com.hust.soict.cnpm.group24.model.dao.NopPhiDAO;


/**
 *
 * @author DELL
 */
public class NopPhiController {
    public static boolean themNopPhi(NopPhi nopPhi){
        return NopPhiDAO.addNopPhi(nopPhi) > 0;
    }
    public static boolean xoaNopPhi(NopPhi nopPhi){
        return NopPhiDAO.delNopPhi(nopPhi) > 0;
    }
}
