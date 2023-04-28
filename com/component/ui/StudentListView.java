package com.component.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.component.model.EmailValidatorServiceProvider;
import com.component.model.Student;

public class StudentListView extends AbstractTableModel {

	private static final String[] COLUMN_NAMES = {"Name","Email","Faculty","Course","Valid Email"};
    private static List<Student> l;
    
    StudentListView(List<Student> sList){
        l=sList;
    }

    @Override
    public int getRowCount() {
        return l.size();
    }

    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
                return l.get(rowIndex).getStudentName();
            case 1: 
                return l.get(rowIndex).getStudentEmail();
            case 2: 
                return l.get(rowIndex).getFaculty();
            case 3: 
                return l.get(rowIndex).getCourse();
            case 4: 
                return EmailValidatorServiceProvider.validate(l.get(rowIndex).getStudentEmail());
            default: 
                return "Error";
        }
    }

}
