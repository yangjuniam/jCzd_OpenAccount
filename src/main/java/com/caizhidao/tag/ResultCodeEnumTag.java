package com.caizhidao.tag;



import com.caizhidao.enums.ResultCodeEnum;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import java.io.IOException;
/**
 * 开户接口编码 tag
 * @author Jail Hu
 */
public class ResultCodeEnumTag extends BodyTagSupport {

    private static final long serialVersionUID = -1393098525987080337L;
    private int index;
    @Override
    public int doEndTag() throws JspException {
        writeToPage(ResultCodeEnum.getName(index));
        return EVAL_PAGE;
    }

    /**
     * @param content 写入到页面的内容
     */
    private void writeToPage(String content) {
        JspWriter out = pageContext.getOut();
        if (content != null && !content.isEmpty()) {
            try {
                out.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
