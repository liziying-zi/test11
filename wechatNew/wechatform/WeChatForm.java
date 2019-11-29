package lzy.wechat.wechatform;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description:WeChatForm
 * @author: lzy
 * @date: 2019/11/27
 */
public class WeChatForm extends JFrame {
    private JPanel panelMain;

    public WeChatForm(){
        setTitle("WeChat Form");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelMain = new JPanel();
        panelMain.setLayout(null);

    }

    /**
    * @Description:设置主界面可见
    * @Param: [visible]
    * @return: void
     * @author: lzy
     * @date: 2019/11/27
    */
    public void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}
