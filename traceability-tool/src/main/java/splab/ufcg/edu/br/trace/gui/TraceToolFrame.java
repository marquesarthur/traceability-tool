/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splab.ufcg.edu.br.trace.gui;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;

import splab.ufcg.edu.br.trace.entities.TraceLinkList;
import splab.ufcg.edu.br.trace.entities.TraceQuery;
import splab.ufcg.edu.br.trace.facade.TraceabilityFacade;
import splab.ufcg.edu.br.trace.query.controller.TraceParser;
import splab.ufcg.edu.br.trace.query.parser.Lexer;
import splab.ufcg.edu.br.trace.query.parser.parser;
import splab.ufcg.edu.br.trace.tlr.CoreEntitiesGenerator;
import splab.ufcg.edu.br.trace.tlr.SourceCodeGenerator;
import splab.ufcg.edu.br.trace.tlr.TLRGenerator;
import splab.ufcg.edu.br.trace.tlr.TestLinkGenerator;
import splab.ufcg.edu.br.trace.tlr.UseCaseGenerator;
import splab.ufcg.edu.br.trace.util.GUIConstants;

/**
 * 
 * @author Arthur
 */
public class TraceToolFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2194927111493838671L;

	// Swing variables
	private javax.swing.JPanel buttonPanel;
	private javax.swing.JMenuItem closeMenuItem;
	private javax.swing.JScrollPane coreScrollPane;
	private RSyntaxTextArea coreTextArea;
	private javax.swing.JButton extractButton;
	private javax.swing.JLabel extractIcon;
	private javax.swing.JMenu fileMenu;
	private javax.swing.JButton indexButton;
	private javax.swing.JLabel indexIcon;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JLabel messageLabel;
	private javax.swing.JMenuItem newProjectMenuItem;
	private javax.swing.JMenuItem openProjectMenuItem;
	private javax.swing.JMenu optionMenu;
	private javax.swing.JMenuItem preferencesMenuItem;
	private javax.swing.JButton queryButton;
	private javax.swing.JLabel queryIcon;
	private javax.swing.JMenuItem saveMenuItem;
	private javax.swing.JScrollPane sourceCodeScrollPane;
	private RSyntaxTextArea sourceCodeTextArea;
	private javax.swing.JScrollPane testCaseScrollPane;
	private RSyntaxTextArea testCaseTextArea;
	private javax.swing.JTabbedPane tracelinkRepresentationTabbedPane;
	private javax.swing.JScrollPane useCaseScrollPane;
	private RSyntaxTextArea useCaseTextArea;

	private TraceabilityFacade facade;

	/**
	 * Creates new form TraceabilityMainFrame
	 */
	public TraceToolFrame() {
		initComponents();

		this.facade = TraceabilityFacade.getInstance();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.initVariables();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		this.initTabbedPanel();

		this.initButtonPanel();

		this.setButtonPanelLayout();

		this.initMenuPanel();

		this.setOverallLayout();

		pack();
	}

	private void setOverallLayout() {
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														buttonPanel,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		tracelinkRepresentationTabbedPane)
																.addContainerGap()))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(
										tracelinkRepresentationTabbedPane,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										459,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(buttonPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap()));
	}

	private void setButtonPanelLayout() {
		javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(
				buttonPanel);
		buttonPanel.setLayout(buttonPanelLayout);
		buttonPanelLayout
				.setHorizontalGroup(buttonPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								buttonPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												buttonPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																messageLabel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																buttonPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				extractIcon)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				extractButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(74,
																				74,
																				74)
																		.addComponent(
																				indexIcon)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				indexButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				80,
																				Short.MAX_VALUE)
																		.addComponent(
																				queryIcon)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				queryButton,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jSeparator1))
										.addContainerGap()));
		buttonPanelLayout
				.setVerticalGroup(buttonPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								buttonPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												messageLabel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												27,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												buttonPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																indexIcon,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																queryButton,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																indexButton,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																queryIcon,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																50,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																buttonPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				extractIcon,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				extractButton,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
	}

	private void initMenuPanel() {
		fileMenu.setText("File");

		newProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_N,
				java.awt.event.InputEvent.CTRL_MASK));
		newProjectMenuItem.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(GUIConstants.NEW_PROJECT_MENU_ICON))); // NOI18N
		newProjectMenuItem.setText("New Project");
		fileMenu.add(newProjectMenuItem);

		openProjectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_O,
				java.awt.event.InputEvent.CTRL_MASK));
		openProjectMenuItem.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(GUIConstants.OPEN_MENU_ICON))); // NOI18N
		openProjectMenuItem.setText("Open Project");
		fileMenu.add(openProjectMenuItem);

		saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_S,
				java.awt.event.InputEvent.CTRL_MASK));
		saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				GUIConstants.SAVE_MENU_ICON))); // NOI18N
		saveMenuItem.setText("Save Project");
		fileMenu.add(saveMenuItem);

		closeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_X,
				java.awt.event.InputEvent.CTRL_MASK));
		closeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				GUIConstants.CLOSE_MENU_ICON))); // NOI18N
		closeMenuItem.setText("Close");
		closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeMenuItemActionPerformed(evt);
			}
		});
		fileMenu.add(closeMenuItem);

		menuBar.add(fileMenu);

		optionMenu.setText("Options");

		preferencesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_P,
				java.awt.event.InputEvent.CTRL_MASK));
		preferencesMenuItem.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource(GUIConstants.PREFERENCES_MENU_ICON))); // NOI18N
		preferencesMenuItem.setText("Project Properties");
		optionMenu.add(preferencesMenuItem);

		menuBar.add(optionMenu);

		setJMenuBar(menuBar);
	}

	private void initButtonPanel() {
		buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		extractButton
				.setText("<html><center>Extract<br>Trace Links</center></html>");
		extractButton.setName("extractButton"); // NOI18N
		extractButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				extractButtonActionPerformed(evt);
			}
		});

		indexButton
				.setText("<html><center>Index <br> Trace Links</center></html>");
		indexButton.setName("indexButton"); // NOI18N
		indexButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				indexButtonActionPerformed(evt);
			}
		});

		queryButton
				.setText("<html><center>Query <br> Trace Links</center></html>");
		queryButton.setName("queryButton"); // NOI18N
		queryButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				queryButtonActionPerformed(evt);
			}
		});

		extractIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				GUIConstants.GEAR_ICON))); // NOI18N
		extractIcon.setName("gearIcon"); // NOI18N
		extractIcon.setSize(new java.awt.Dimension(40, 40));

		indexIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				GUIConstants.DATABASE_ICON))); // NOI18N
		indexIcon.setName("databaseIcon"); // NOI18N
		indexIcon.setSize(new java.awt.Dimension(40, 40));

		queryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				GUIConstants.SEARCH_ICON))); // NOI18N
		queryIcon.setName("searchIcon"); // NOI18N
		queryIcon.setSize(new java.awt.Dimension(40, 40));
	}

	private void initTabbedPanel() {
		tracelinkRepresentationTabbedPane.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());

		coreTextArea.setColumns(20);
		coreTextArea.setRows(5);
		coreScrollPane.setViewportView(coreTextArea);

		tracelinkRepresentationTabbedPane.addTab("Core", coreScrollPane);

		testCaseTextArea.setColumns(20);
		testCaseTextArea.setRows(5);
		testCaseScrollPane.setViewportView(testCaseTextArea);

		tracelinkRepresentationTabbedPane.addTab("Test Cases",
				testCaseScrollPane);

		sourceCodeTextArea.setColumns(20);
		sourceCodeTextArea.setRows(5);
		sourceCodeScrollPane.setViewportView(sourceCodeTextArea);

		tracelinkRepresentationTabbedPane.addTab("Source Code",
				sourceCodeScrollPane);

		useCaseScrollPane.setEnabled(false);

		useCaseTextArea.setColumns(20);
		useCaseTextArea.setRows(5);
		useCaseScrollPane.setViewportView(useCaseTextArea);

		tracelinkRepresentationTabbedPane
				.addTab("Use Cases", useCaseScrollPane);
	}

	private void initVariables() {
		tracelinkRepresentationTabbedPane = new javax.swing.JTabbedPane();
		coreScrollPane = new javax.swing.JScrollPane();
		coreTextArea = new RSyntaxTextArea();

		this.setUTLStyle(coreTextArea);

		Font font = new Font("Monaco", Font.BOLD, 13);
		coreTextArea.setFont(font);

		testCaseScrollPane = new javax.swing.JScrollPane();
		testCaseTextArea = new RSyntaxTextArea();
		this.setUTLStyle(testCaseTextArea);
		testCaseTextArea.setFont(font);

		sourceCodeScrollPane = new javax.swing.JScrollPane();
		sourceCodeTextArea = new RSyntaxTextArea();
		this.setUTLStyle(sourceCodeTextArea);
		sourceCodeTextArea.setFont(font);

		useCaseScrollPane = new javax.swing.JScrollPane();
		useCaseTextArea = new RSyntaxTextArea();
		this.setUTLStyle(useCaseTextArea);
		useCaseTextArea.setFont(font);

		buttonPanel = new javax.swing.JPanel();
		extractButton = new javax.swing.JButton();
		indexButton = new javax.swing.JButton();
		queryButton = new javax.swing.JButton();
		extractIcon = new javax.swing.JLabel();
		indexIcon = new javax.swing.JLabel();
		queryIcon = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		messageLabel = new javax.swing.JLabel();
		menuBar = new javax.swing.JMenuBar();
		fileMenu = new javax.swing.JMenu();
		newProjectMenuItem = new javax.swing.JMenuItem();
		openProjectMenuItem = new javax.swing.JMenuItem();
		saveMenuItem = new javax.swing.JMenuItem();
		closeMenuItem = new javax.swing.JMenuItem();
		optionMenu = new javax.swing.JMenu();
		preferencesMenuItem = new javax.swing.JMenuItem();
	}

	private void setUTLStyle(RSyntaxTextArea textArea) {
		AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory) TokenMakerFactory
				.getDefaultInstance();
		atmf.putMapping("UTL", "splab.ufcg.edu.br.trace.util.UTLToken");
		textArea.setSyntaxEditingStyle("UTL");
	}

	private void extractButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_extractButtonActionPerformed

		boolean result = true;
		long startTime = System.currentTimeMillis();
		try {

			result = this.facade.extractTraceLinks();

			TraceLinkList extractedTraceLinkList = this.facade.readTraceLinks();

			this.buildTraceLinkRepresentationLanguage(extractedTraceLinkList);

		} catch (Exception ex) {
			ex.printStackTrace();
			result = false;
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		this.buildExtractionResultMessage(result, duration);
	}

	private void buildTraceLinkRepresentationLanguage(
			TraceLinkList extractedTraceLinkList) throws Exception {

		
		
		TLRGenerator core = new CoreEntitiesGenerator(extractedTraceLinkList);
		TLRGenerator testlink = new TestLinkGenerator(extractedTraceLinkList);
		TLRGenerator sourceCode = new SourceCodeGenerator(extractedTraceLinkList);
		TLRGenerator useCases = new UseCaseGenerator(extractedTraceLinkList);

		
		coreTextArea.setText(core.generateTLR());
		testCaseTextArea.setText(testlink.generateTLR());
		sourceCodeTextArea.setText(sourceCode.generateTLR());
		useCaseTextArea.setText(useCases.generateTLR());

	}

	private void buildExtractionResultMessage(boolean result, long duration) {
		if (result) {
			StringBuilder sucessMessage = new StringBuilder();
			sucessMessage.append("Trace links extracted successfully. ");
			sucessMessage.append(duration);
			sucessMessage.append(" ms");

			this.buildOperationResult(sucessMessage.toString(),
					GUIConstants.SUCCESS_ICON);

		} else {
			this.buildOperationResult(GUIConstants.EXTRACTION_ERROR_MESSAGE,
					GUIConstants.ALERT_ICON);
		}
	}

	private void queryButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_queryButtonActionPerformed

		try {
			Map<String, TraceQuery> mapQueries = new HashMap<String, TraceQuery>();

			Lexer scanner = new Lexer(new java.io.StringReader(
					coreTextArea.getText()));

			parser parser = new parser(scanner);
			parser.parse();

			TraceParser traceParser = TraceParser.getInstance();
			if (traceParser.getParsedQueries() != null) {
				for (TraceQuery parsedQuery : traceParser.getParsedQueries()) {
					mapQueries.put(parsedQuery.getName(), parsedQuery);
				}
			}

			new QueryFrame(mapQueries);
		} catch (Exception e) {
			e.printStackTrace();

			this.buildOperationResult(GUIConstants.PARSER_ERROR_MESSAGE,
					GUIConstants.ALERT_ICON);

		} finally {

		}

	}// GEN-LAST:event_queryButtonActionPerformed

	private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeMenuItemActionPerformed
		this.dispose();
	}// GEN-LAST:event_closeMenuItemActionPerformed

	private void indexButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_indexButtonActionPerformed

		boolean result = true;
		long startTime = System.currentTimeMillis();
		try {

			result = this.facade.indexTraceLinks();

		} catch (Exception ex) {
			ex.printStackTrace();
			result = false;
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;

		this.buildIndexResultMessage(result, duration);
	}// GEN-LAST:event_indexButtonActionPerformed

	private void buildIndexResultMessage(boolean result, long duration) {
		if (result) {
			StringBuilder sucessMessage = new StringBuilder();
			sucessMessage.append("Trace links indexed successfully. ");
			sucessMessage.append(duration);
			sucessMessage.append(" ms");

			this.buildOperationResult(sucessMessage.toString(),
					GUIConstants.SUCCESS_ICON);
		} else {
			this.buildOperationResult(GUIConstants.INDEX_ERROR_MESSAGE,
					GUIConstants.ALERT_ICON);
		}
	}

	private void buildOperationResult(String message, String icon) {

		messageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				icon)));
		messageLabel.setText(message);
	}

	

}
