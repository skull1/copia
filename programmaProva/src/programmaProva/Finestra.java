package programmaProva;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.Label;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;



import javax.swing.JList;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;




public class Finestra {
	
	JFrame frmCercacompagno;

	//public riempi b=new riempi(this);
	
	
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra window = new Finestra();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        panel.setLayout(new GridLayout(1, 1));
        
        
        JLabel filler = new JLabel(text);
        panel.add(filler);
        filler.setHorizontalAlignment(JLabel.LEFT);
        
        return panel;
    }
	JTextArea txtrProva;
	DefaultListModel<String> listModel = new DefaultListModel<>();
	DefaultListModel listModel2 = new DefaultListModel();
	JList<String> list = new JList<String>(listModel) {
        private transient MouseAdapter cbml;
        @Override public void updateUI() {
            removeMouseListener(cbml);
            removeMouseMotionListener(cbml);
            super.updateUI();
            setFixedCellHeight(-1);
            cbml = new CellButtonsMouseListener(this);
            addMouseListener(cbml);
            addMouseMotionListener(cbml);
            setCellRenderer(new ButtonsRenderer<String>(listModel));
        }
    };
    
   
    //JList userList = new JList(listModel2);  
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTable table;
    
    /*
    userList.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		JList userList = (JList)arg0.getSource();
            if (arg0.getClickCount() == 2) {

    		Finestra window = new Finestra();
				window.frame.setVisible(true);
            }
    	}
    });
    */
    
	public Finestra() {
		frmCercacompagno = new JFrame();
		frmCercacompagno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
			        System.out.println("Hello");

			       
			    }
			}
		});
		
		frmCercacompagno.setTitle("CercaCompagno");
		
		frmCercacompagno.setBounds(100, 100, 976, 538);
		frmCercacompagno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCercacompagno.getContentPane().setLayout(null);
		
	    /*txtrProva = new JTextArea();
		txtrProva.setEditable(false);
	
		txtrProva.setText("prima notizia\n");
		txtrProva.append("seconda notizia\n");
		txtrProva.append("terza notizia\n");
		
		txtrProva.setBounds(20, 36, 413, 271);
		frame.getContentPane().add(txtrProva);*/
		
		/*JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 339, 455, 133);
		frame.getContentPane().add(tabbedPane);
		JComponent panel1 = makeTextPanel("Panello #1");
		JComponent panel2 = makeTextPanel("Panello #2");
		JComponent panel3 = makeTextPanel("Panello #3");
        tabbedPane.addTab("About Me", panel1);
        tabbedPane.addTab("Links", panel2);
        tabbedPane.addTab("Settings", panel3);*/
        
        //DefaultListModel<String> listModel = new DefaultListModel<>();
      
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green"); 
        listModel.addElement("Kathy Green");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel.addElement("Jane Doe");
        listModel.addElement("John Smith");
        listModel.addElement("Kathy Green");
        listModel2.addElement("Jane Doe");
        listModel2.addElement("John Smith");
        listModel2.addElement("Kathy Green");
        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(650, 39, 300, 432);
        frmCercacompagno.getContentPane().add(scrollPane);
        
        /*JList<String> list = new JList<String>(listModel) {
            private transient MouseAdapter cbml;
            @Override public void updateUI() {
                removeMouseListener(cbml);
                removeMouseMotionListener(cbml);
                super.updateUI();
                setFixedCellHeight(-1);
                cbml = new CellButtonsMouseListener(this);
                addMouseListener(cbml);
                addMouseMotionListener(cbml);
                setCellRenderer(new ButtonsRenderer<String>(listModel));
            }
        };*/
        
      /*  JList list = new JList(listModel);
        list.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		JList list = (JList)arg0.getSource();
                if (arg0.getClickCount() == 2) {

        		Finestra window = new Finestra();
					window.frame.setVisible(true);
                	listModel.addElement("Kathy Green");
                	//riempi b=new riempi(this);
                	
                }
        	}
        });*/
        
        frmCercacompagno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 2) {
					listModel.addElement("Kathy Green");
					txtrProva.append("terza notizia\n");
					txtrProva.setText("primsssa notizia\n");
				}
			}
		});
        scrollPane.setViewportView(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
        
        JLabel lblCentroNotifiche = new JLabel("Centro Notifiche");
        lblCentroNotifiche.setBounds(650, 11, 111, 14);
        frmCercacompagno.getContentPane().add(lblCentroNotifiche);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(269, 39, 370, 432);
        frmCercacompagno.getContentPane().add(scrollPane_1);
        
        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		
        		JTable table = (JTable)arg0.getSource();
                if (arg0.getClickCount() == 2) {

        		Finestra window = new Finestra();
					window.frmCercacompagno.setVisible(true);
                }
        	}
        });
        scrollPane_1.setViewportView(table);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"mario", "rossi", "sdgdsf@lal.it", "si", "no"},
        		{"marco", "ferrar", "adsasd@msn.com", "no", "si"},
        		{null, "", null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"Nome", "Cognome", "Email", "Disponibile", "Online"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, false, false, false, false
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        table.getColumnModel().getColumn(2).setPreferredWidth(117);
        table.getColumnModel().getColumn(3).setPreferredWidth(61);
        table.getColumnModel().getColumn(4).setPreferredWidth(47);
        
        
        /*scrollPane_1.setViewportView(userList);
        userList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        userList.setLayoutOrientation(JList.VERTICAL);
        userList.setVisibleRowCount(-1);*/
        
        JLabel lblUserlist = new JLabel("UserList");
        lblUserlist.setBounds(269, 11, 102, 14);
        frmCercacompagno.getContentPane().add(lblUserlist);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBorder(new TitledBorder(null, "Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        layeredPane.setBounds(20, 30, 239, 441);
        frmCercacompagno.getContentPane().add(layeredPane);
        
        textField = new JTextField();
        textField.setBounds(120, 39, 86, 20);
        layeredPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(22, 42, 46, 14);
        layeredPane.add(lblNome);
        
        JLabel lblCognome = new JLabel("Cognome:");
        lblCognome.setBounds(22, 85, 86, 14);
        layeredPane.add(lblCognome);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(22, 127, 46, 14);
        layeredPane.add(lblEmail);
        
        JLabel lblNmatricola = new JLabel("N.Matricola:");
        lblNmatricola.setBounds(22, 175, 69, 14);
        layeredPane.add(lblNmatricola);
        
        JLabel lblCollega = new JLabel("Collega:");
        lblCollega.setBounds(22, 223, 46, 14);
        layeredPane.add(lblCollega);
        
        JLabel lblDisponibilit = new JLabel("Disponibilit\u00E0:");
        lblDisponibilit.setBounds(22, 275, 69, 14);
        layeredPane.add(lblDisponibilit);
        
        textField_1 = new JTextField();
        textField_1.setBounds(120, 82, 86, 20);
        layeredPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(120, 124, 86, 20);
        layeredPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(120, 172, 86, 20);
        layeredPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(120, 220, 86, 20);
        layeredPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(120, 272, 86, 20);
        layeredPane.add(textField_5);
        textField_5.setColumns(10);
		
	}

	void append(){
		//txtrProva.append("terza notiziaaaa\n");
	}
}


class CellButtonsMouseListener extends MouseAdapter {
    private int prevIndex = -1;
    private JButton prevButton;
    private final JList<String> list;
    protected CellButtonsMouseListener(JList<String> list) {
        super();
        this.list = list;
    }
    @Override public void mouseMoved(MouseEvent e) {
        //JList list = (JList) e.getComponent();
        Point pt = e.getPoint();
        int index = list.locationToIndex(pt);
        if (!list.getCellBounds(index, index).contains(pt)) {
            if (prevIndex >= 0) {
                listRepaint(list, list.getCellBounds(prevIndex, prevIndex));
            }
            index = -1;
            prevButton = null;
            return;
        }
        if (index >= 0) {
            JButton button = getButton(list, pt, index);
            ButtonsRenderer renderer = (ButtonsRenderer) list.getCellRenderer();
            renderer.button = button;
            if (Objects.nonNull(button)) {
                button.getModel().setRollover(true);
                renderer.rolloverIndex = index;
                if (!button.equals(prevButton)) {
                    listRepaint(list, list.getCellBounds(prevIndex, index));
                }
            } else {
                renderer.rolloverIndex = -1;
                Rectangle r = null;
                if (prevIndex == index) {
                    if (prevIndex >= 0 && Objects.nonNull(prevButton)) {
                        r = list.getCellBounds(prevIndex, prevIndex);
                    }
                } else {
                    r = list.getCellBounds(index, index);
                }
                listRepaint(list, r);
                prevIndex = -1;
            }
            prevButton = button;
        }
        prevIndex = index;
    }
    @Override public void mousePressed(MouseEvent e) {
        //JList list = (JList) e.getComponent();
        Point pt = e.getPoint();
        int index = list.locationToIndex(pt);
        if (index >= 0) {
            JButton button = getButton(list, pt, index);
            if (Objects.nonNull(button)) {
                ButtonsRenderer renderer = (ButtonsRenderer) list.getCellRenderer();
                renderer.pressedIndex = index;
                renderer.button = button;
                listRepaint(list, list.getCellBounds(index, index));
            }
        }
    }
    @Override public void mouseReleased(MouseEvent e) {
        //JList list = (JList) e.getComponent();
        Point pt = e.getPoint();
        int index = list.locationToIndex(pt);
        if (index >= 0) {
            JButton button = getButton(list, pt, index);
            if (Objects.nonNull(button)) {
                ButtonsRenderer renderer = (ButtonsRenderer) list.getCellRenderer();
                renderer.pressedIndex = -1;
                renderer.button = null;
                button.doClick();
                listRepaint(list, list.getCellBounds(index, index));
            }
        }
    }
    private static void listRepaint(JList list, Rectangle rect) {
        if (Objects.nonNull(rect)) {
            list.repaint(rect);
        }
    }
    private static JButton getButton(JList<String> list, Point pt, int index) {
        Component c = list.getCellRenderer().getListCellRendererComponent(list, "", index, false, false);
        Rectangle r = list.getCellBounds(index, index);
        c.setBounds(r);
        //c.doLayout(); //may be needed for mone LayoutManager
        pt.translate(-r.x, -r.y);
        Component b = SwingUtilities.getDeepestComponentAt(c, pt.x, pt.y);
        if (b instanceof JButton) {
            return (JButton) b;
        } else {
            return null;
        }
    }
}

class ButtonsRenderer<E> extends JPanel implements ListCellRenderer<E> {
    private static final Color EVEN_COLOR = new Color(230, 255, 230);
    private final JTextArea textArea = new JTextArea();
    private final JButton rejectButton = new JButton(new AbstractAction("Rifiuta") {
        @Override public void actionPerformed(ActionEvent e) {
            if (model.getSize() > 1) {
                model.remove(index);
            }
        }
    });
    private final JButton acceptButton = new JButton(new AbstractAction("Accetta") {
        @Override public void actionPerformed(ActionEvent e) {
            model.add(index, model.get(index));
        }
    });
    private final DefaultListModel<E> model;
    private int index;
    public int pressedIndex  = -1;
    public int rolloverIndex = -1;
    public JButton button;

    protected ButtonsRenderer(DefaultListModel<E> model) {
        super(new BorderLayout());
        this.model = model;
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        setOpaque(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        add(textArea);

        Box box = Box.createHorizontalBox();
        for (JButton b: Arrays.asList(rejectButton, acceptButton)) {
            b.setFocusable(false);
            b.setRolloverEnabled(false);
            box.add(b);
            box.add(Box.createHorizontalStrut(5));
        }
        add(box, BorderLayout.EAST);
    }
    @Override public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        d.width = 0; // VerticalScrollBar as needed
        return d;
    }
    @Override public Component getListCellRendererComponent(JList<? extends E> list, E value, int index, boolean isSelected, boolean cellHasFocus) {
        textArea.setText(Objects.toString(value, ""));
        this.index = index;
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            textArea.setForeground(list.getSelectionForeground());
        } else {
            setBackground(index % 2 == 0 ? EVEN_COLOR : list.getBackground());
            textArea.setForeground(list.getForeground());
        }
        resetButtonStatus();
        if (Objects.nonNull(button)) {
            if (index == pressedIndex) {
                button.getModel().setSelected(true);
                button.getModel().setArmed(true);
                button.getModel().setPressed(true);
            } else if (index == rolloverIndex) {
                button.getModel().setRollover(true);
            }
        }
        return this;
    }
    private void resetButtonStatus() {
        for (JButton b: Arrays.asList(rejectButton, acceptButton)) {
            ButtonModel m = b.getModel();
            m.setRollover(false);
            m.setArmed(false);
            m.setPressed(false);
            m.setSelected(false);
        }
    }
}

