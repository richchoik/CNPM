package com.hust.soict.cnpm.group24.model.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

public class ThongKe {
    private List<String> columns;
    private Vector<Vector<String>> rows;
    public ThongKe(){
        this.columns = new ArrayList<>();
        columns.add("Mã hộ");
        this.rows = new Vector<>();
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public Vector<Vector<String>> getRows() {
        return rows;
    }

    public void setRows(Vector<Vector<String>> rows) {
        this.rows = rows;
    }
}
