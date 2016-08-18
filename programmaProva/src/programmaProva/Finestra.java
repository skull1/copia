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




public class Finestra {
	
	JFrame frame;

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
	
	JLabel lblNews;
	JTextArea txtrProva;
	DefaultListModel<String> listModel = new DefaultListModel<>();
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
	public Finestra() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 976, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNews = new JLabel("News");
		lblNews.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNews);
		
	    txtrProva = new JTextArea();
		txtrProva.setEditable(false);
	
		txtrProva.setText("prima notizia\n");
		txtrProva.append("seconda notizia\n");
		txtrProva.append("terza notizia\n");
		
		txtrProva.setBounds(20, 36, 413, 271);
		frame.getContentPane().add(txtrProva);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 339, 455, 133);
		frame.getContentPane().add(tabbedPane);
		JComponent panel1 = makeTextPanel("Panello #1");
		JComponent panel2 = makeTextPanel("Panello #2");
		JComponent panel3 = makeTextPanel("Panello #3");
        tabbedPane.addTab("About Me", panel1);
        tabbedPane.addTab("Links", panel2);
        tabbedPane.addTab("Settings", panel3);
        
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
        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(475, 11, 300, 461);
        frame.getContentPane().add(scrollPane);
        
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
        
        frame.addMouseListener(new MouseAdapter() {
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
		
	}

	void append(){
		txtrProva.append("terza notiziaaaa\n");
	}
	/*public void initialize() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 976, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNews = new JLabel("News");
		lblNews.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNews);
		
		JTextArea txtrProva = new JTextArea();
		txtrProva.setEditable(false);
		
		txtrProva.setText("prima notizia\n");
		txtrProva.append("seconda notizia\n");
		txtrProva.append("terza notizia\n");
		
		txtrProva.setBounds(20, 36, 413, 271);
		frame.getContentPane().add(txtrProva);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 339, 455, 133);
		frame.getContentPane().add(tabbedPane);
		JComponent panel1 = makeTextPanel("Panello #1");
		JComponent panel2 = makeTextPanel("Panello #2");
		JComponent panel3 = makeTextPanel("Panello #3");
        tabbedPane.addTab("About Me", panel1);
        tabbedPane.addTab("Links", panel2);
        tabbedPane.addTab("Settings", panel3);
        
        DefaultListModel listModel = new DefaultListModel();
      
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
        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(475, 11, 300, 461);
        frame.getContentPane().add(scrollPane);
        
        
        
        JList list = new JList(listModel);
        list.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		JList list = (JList)arg0.getSource();
                if (arg0.getClickCount() == 2) {

        		Finestra window = new Finestra();
					window.frame.setVisible(true);
                }
        	}
        });
        scrollPane.setViewportView(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(-1);
	}*/

	

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

