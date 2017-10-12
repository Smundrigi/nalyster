
package com.elle.ProjectManager.presentation;

import com.elle.ProjectManager.database.DBConnection;
import com.elle.ProjectManager.database.Database;
import com.elle.ProjectManager.database.Server;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;


/**
 *
 * @author Louis W.
 * @author Carlos Igreja
 * @since June 10, 2015
 * @version 0.6.3
 */
public class EditDatabaseWindow extends javax.swing.JFrame 

{
    
    LoginWindow loginWindow ;
    boolean flag = false;   // true if call this class from log in window
    private ArrayList<Server> servers;
    
    /**
     * Creates new form EditDatabaseList
     */
    public EditDatabaseWindow() 
    {
        this(null);
    }
    
    // Call this class from log in window
    public EditDatabaseWindow(LoginWindow loginWindow) 
    {
        initComponents();
        this.loginWindow = loginWindow;

        labelServersInfo.setText("");
        labelDatabasesInfo.setText("");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // set the servers, cb, databases
        servers = DBConnection.readServers();
        fillServersTable(tableServers);
        
        cbServer.setModel(getServerNamesCBModel());
        fillDatabasesTable(tableDatabases, servers.get(0).getName());
        
        //set cellrenderers to make the password invisible-Wei
        JPasswordField password = new JPasswordField();
        password.setBorder( new LineBorder(Color.BLACK) );
        TableCellEditor editor = new DefaultCellEditor( password );
        tableDatabases.getColumnModel().getColumn(3).setCellEditor( editor );
        tableDatabases.getColumnModel().getColumn(3).setCellRenderer(new passwordrender());
        
        // set table listeners
        setTableListeners(tableServers);
        setTableListeners(tableDatabases);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnSaveServers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableServers = new javax.swing.JTable();
        btnCancelServers = new javax.swing.JButton();
        btnAddServers = new javax.swing.JButton();
        btnDeleteServers = new javax.swing.JButton();
        labelServersInfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbServer = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDatabases = new javax.swing.JTable();
        btnSaveDatabases = new javax.swing.JButton();
        btnCancelDatabases = new javax.swing.JButton();
        btnAddDatabases = new javax.swing.JButton();
        btnDeleteDatabases = new javax.swing.JButton();
        labelDatabasesInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSaveServers.setText("Save");
        btnSaveServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveServersActionPerformed(evt);
            }
        });

        tableServers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Default", "Server Name", "Server URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableServers.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(tableServers);
        if (tableServers.getColumnModel().getColumnCount() > 0) {
            tableServers.getColumnModel().getColumn(0).setMinWidth(50);
            tableServers.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableServers.getColumnModel().getColumn(0).setMaxWidth(50);
            tableServers.getColumnModel().getColumn(1).setMinWidth(200);
            tableServers.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableServers.getColumnModel().getColumn(1).setMaxWidth(200);
            tableServers.getColumnModel().getColumn(2).setResizable(false);
            tableServers.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        btnCancelServers.setText("Cancel");
        btnCancelServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelServersActionPerformed(evt);
            }
        });

        btnAddServers.setText("Add");
        btnAddServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServersActionPerformed(evt);
            }
        });

        btnDeleteServers.setText("Delete");
        btnDeleteServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteServersActionPerformed(evt);
            }
        });

        labelServersInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelServersInfo.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(labelServersInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAddServers, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteServers, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveServers, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelServers, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveServers)
                    .addComponent(btnCancelServers)
                    .addComponent(btnAddServers)
                    .addComponent(btnDeleteServers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelServersInfo)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Servers", jPanel3);

        cbServer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AWS", "Local" }));
        cbServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbServerActionPerformed(evt);
            }
        });

        tableDatabases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Default", "Database Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableDatabases);
        if (tableDatabases.getColumnModel().getColumnCount() > 0) {
            tableDatabases.getColumnModel().getColumn(0).setMinWidth(50);
            tableDatabases.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableDatabases.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnSaveDatabases.setText("Save");
        btnSaveDatabases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDatabasesActionPerformed(evt);
            }
        });

        btnCancelDatabases.setText("Cancel");
        btnCancelDatabases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDatabasesActionPerformed(evt);
            }
        });

        btnAddDatabases.setText("Add");
        btnAddDatabases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDatabasesActionPerformed(evt);
            }
        });

        btnDeleteDatabases.setText("Delete");
        btnDeleteDatabases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDatabasesActionPerformed(evt);
            }
        });

        labelDatabasesInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDatabasesInfo.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(cbServer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(labelDatabasesInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAddDatabases, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteDatabases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveDatabases, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelDatabases, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cbServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveDatabases)
                    .addComponent(btnCancelDatabases)
                    .addComponent(btnAddDatabases)
                    .addComponent(btnDeleteDatabases))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDatabasesInfo)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Databases", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbServerActionPerformed
        String selectedServer = cbServer.getSelectedItem().toString();
        fillDatabasesTable(tableDatabases, selectedServer);
    }//GEN-LAST:event_cbServerActionPerformed

    private void btnSaveServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveServersActionPerformed
        int rowCount = tableServers.getModel().getRowCount(); // these might be null

        // update the servers
        for(int row = 0; row < rowCount; row++){
            boolean setDefault = (boolean) tableServers.getModel().getValueAt(row, 0);
            String serverName = (String) tableServers.getModel().getValueAt(row, 1);
            String serverURL = (String) tableServers.getModel().getValueAt(row, 2);
            servers.get(row).setDefaultSelection(setDefault);
            servers.get(row).setName(serverName);
            servers.get(row).setUrl(serverURL);
        }
        
        DBConnection.writeServers(servers); // save to file
        cbServer.setModel(getServerNamesCBModel()); // update server dropdown
        fillDatabasesTable(tableDatabases, cbServer.getSelectedItem().toString());
        labelServersInfo.setText("Servers saved!");
        startCountDownFromNow();
        
        //update loginwindow
        if(loginWindow != null){
            loginWindow.loadServers();
        }
    }//GEN-LAST:event_btnSaveServersActionPerformed

    private void btnSaveDatabasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDatabasesActionPerformed
        int dbCount = tableDatabases.getModel().getRowCount(); // these might be null
        int server = cbServer.getSelectedIndex();

        // update the servers
        for(int db = 0; db < dbCount; db++){
            boolean setDefault = (boolean) tableDatabases.getModel().getValueAt(db, 0);
            String dbName = (String) tableDatabases.getModel().getValueAt(db, 1);
            String dbUsername = (String) tableDatabases.getModel().getValueAt(db, 2);
            String dbPassword = (String) tableDatabases.getModel().getValueAt(db, 3);
            servers.get(server).getDatabases().get(db).setDefaultSelection(setDefault);
            servers.get(server).getDatabases().get(db).setName(dbName);
            servers.get(server).getDatabases().get(db).setUsername(dbUsername);
            servers.get(server).getDatabases().get(db).setPassword(dbPassword);
        }
        DBConnection.writeServers(servers);
        labelDatabasesInfo.setText("Databases saved!");
        startCountDownFromNow();
        
        //update loginwindow
        if(loginWindow != null){
            loginWindow.loadServers();
        }
    }//GEN-LAST:event_btnSaveDatabasesActionPerformed

    private void btnCancelServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelServersActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelServersActionPerformed

    private void btnAddServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServersActionPerformed
        DefaultTableModel model = (DefaultTableModel)tableServers.getModel();
        model.addRow(new Object[]{false,"",""});
        servers.add(new Server());
    }//GEN-LAST:event_btnAddServersActionPerformed

    private void btnDeleteServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteServersActionPerformed
        int selectedRow = tableServers.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tableServers.getModel();
        if(selectedRow != -1){
            model.removeRow(selectedRow);
            servers.remove(selectedRow);
        }
    }//GEN-LAST:event_btnDeleteServersActionPerformed

    private void btnAddDatabasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDatabasesActionPerformed
        DefaultTableModel model = (DefaultTableModel)tableDatabases.getModel();
        model.addRow(new Object[]{false,"","",""});
        int server = cbServer.getSelectedIndex();
        servers.get(server).getDatabases().add(new Database());
    }//GEN-LAST:event_btnAddDatabasesActionPerformed

    private void btnDeleteDatabasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDatabasesActionPerformed
        int server = cbServer.getSelectedIndex();
        int database = tableDatabases.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tableDatabases.getModel();
        if(database != -1){
            model.removeRow(database);
            servers.get(server).getDatabases().remove(database);
        }
    }//GEN-LAST:event_btnDeleteDatabasesActionPerformed

    private void btnCancelDatabasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDatabasesActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelDatabasesActionPerformed


    private void fillServersTable(JTable table){

        // reset table
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        // fill table with servers
        for(int row = 0; row < servers.size(); row++){
            Server server = servers.get(row);
            Vector rowData = new Vector(3);
            rowData.addElement(server.isDefaultSelection());
            rowData.addElement(server.getName());
            rowData.addElement(server.getUrl());
            model.addRow(rowData);
        }
    }

    private void fillDatabasesTable(JTable table, String serverName){
        
        // reset table
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        // get the databases for the selected server
        ArrayList<Database> databases = new ArrayList<>();
        for(Server server: servers){
            if(server.getName().equals(serverName)){
                databases = server.getDatabases();
            }
        }
        
        // fill table with the databases
        for(Database database: databases){
            Vector rowData = new Vector(4);
            rowData.addElement(database.isDefaultSelection());
            rowData.addElement(database.getName());
            rowData.addElement(database.getUsername());
            rowData.addElement(database.getPassword());
            model.addRow(rowData);
        }
    }
    
    private DefaultComboBoxModel getServerNamesCBModel(){
        Vector serverNames = new Vector();
        for(Server server: servers){
            serverNames.addElement(server.getName());
        }
        return new DefaultComboBoxModel(serverNames);
    }
    
    //set the timer for information Label show
    public void startCountDownFromNow() {
        Timer timer = new Timer(5 * 1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                labelServersInfo.setText("");
                labelDatabasesInfo.setText("");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    /**
     * Sets the table listeners.
     * Currently used to listen for changes or mouse/key pressed to enable the 
     * save buttons when the table is not being edited.
     * @param table 
     */
    private void setTableListeners(JTable table)
    {
        final JTable tableTemp = table;
        
        table.addKeyListener(new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent e) 
            {
            }

            @Override
            public void keyPressed(KeyEvent e) 
            {
            }

            @Override
            public void keyReleased(KeyEvent e) 
            {
            
                // set save button enabled only when not editing the table
             
                boolean b = !tableTemp.isEditing();
                if(tableTemp.equals(tableServers))
                {
                    btnSaveServers.setEnabled(b);
                }
                else
                {
                    btnSaveDatabases.setEnabled(b);
                }
            }
        });
        
        /*  Author:Swapna
            Date: 28th Sept 2017
            Temporary variable to access the table variable
        */
        final JTable table_Temp_mousePressed = table;
         final JTable table_Temp_mouseClicked = table;
        table.addMouseListener(new MouseAdapter() 
        {
           
            public void mouseClicked(MouseEvent e) 
            {
                int rows = table_Temp_mouseClicked.getRowCount();
                int selectedRow = table_Temp_mouseClicked.rowAtPoint(e.getPoint());
                int selectedCol = table_Temp_mouseClicked.columnAtPoint(e.getPoint());
                boolean selectedDefault;
                if(selectedCol == 0)
                { // this is the default checkbox column
                    for(int row = 0; row < rows; row++)
                    {
                        selectedDefault = (row == selectedRow)?true:false;
                        table_Temp_mouseClicked.setValueAt(selectedDefault, row, 0);
                    }
                }
            }
            //table_Temp_mouseClicked = table;
            
            /*  Author:Swapna
            Date: 28th Sept 2017
            Temporary variable to access the table variable
            */   
            public void mousePressed(MouseEvent e) 
            {
                // set save button enabled only when not editing the table
                boolean b = !table_Temp_mousePressed.isEditing();
                if(table_Temp_mousePressed.equals(tableServers)){
                    btnSaveServers.setEnabled(b);
                }
                else{
                    btnSaveDatabases.setEnabled(b);
                }
            }
        });
        /*  Author:Swapna
            Date: 28th Sept 2017
            Temporary variable to access the table variable
        */
        final JTable tableChangedtemp = table;
        table.getModel().addTableModelListener(new TableModelListener() 
        {
            @Override
            public void tableChanged(TableModelEvent e) 
            {
                // set save button enabled only when not editing the table
                boolean b = !tableChangedtemp.isEditing();
                if(tableChangedtemp.equals(tableServers)){
                    btnSaveServers.setEnabled(b);
                }
                else{
                    btnSaveDatabases.setEnabled(b);
                }
            }
        });
        table = tableChangedtemp;
    }
    
    public class passwordrender extends DefaultTableCellRenderer {

        private static final String ASTERISKS = "************************";
        
        @Override public void setValue(Object aValue) {
            int length =0;
            if (aValue instanceof String) {
                length =  ((String) aValue).length();
            } else if (aValue instanceof char[]) {
                length = ((char[])aValue).length;
            }
                super.setText(asterisks(length));

        }

        private String asterisks(int length) {
            if (length > ASTERISKS.length()) {
                StringBuilder sb = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    sb.append('*');
                }
                return sb.toString();
            } else {
                return ASTERISKS.substring(0, length);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDatabases;
    private javax.swing.JButton btnAddServers;
    private javax.swing.JButton btnCancelDatabases;
    private javax.swing.JButton btnCancelServers;
    private javax.swing.JButton btnDeleteDatabases;
    private javax.swing.JButton btnDeleteServers;
    private javax.swing.JButton btnSaveDatabases;
    private javax.swing.JButton btnSaveServers;
    private javax.swing.JComboBox cbServer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDatabasesInfo;
    private javax.swing.JLabel labelServersInfo;
    private javax.swing.JTable tableDatabases;
    private javax.swing.JTable tableServers;
    // End of variables declaration//GEN-END:variables

}
