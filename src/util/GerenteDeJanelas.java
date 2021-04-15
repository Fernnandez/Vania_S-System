package util;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenteDeJanelas {

    private static JDesktopPane jdeskTopPane;

    public GerenteDeJanelas(JDesktopPane jdeskTopPane) {
        GerenteDeJanelas.jdeskTopPane = jdeskTopPane;
    }

    public void abrirJanela(JInternalFrame jInternalFrame) {
        if (jInternalFrame.isVisible()) {
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        } else {
            jdeskTopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
            Dimension d = jInternalFrame.getDesktopPane().getSize();
            jInternalFrame.setLocation((d.width - jInternalFrame.getSize().width) / 2, (d.height - jInternalFrame.getSize().height) / 2);
        }
    }
}
