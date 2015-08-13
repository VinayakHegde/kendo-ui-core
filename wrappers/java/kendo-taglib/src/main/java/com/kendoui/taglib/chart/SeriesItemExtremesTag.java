
package com.kendoui.taglib.chart;


import com.kendoui.taglib.BaseTag;
import com.kendoui.taglib.json.Function;





import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class SeriesItemExtremesTag extends  BaseTag  /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        SeriesItemTag parent = (SeriesItemTag)findParentWithClass(SeriesItemTag.class);


        parent.setExtremes(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "chart-seriesItem-extremes";
    }

    public void setBorder(com.kendoui.taglib.chart.SeriesItemExtremesBorderTag value) {
        setProperty("border", value);
    }

    public void setBackground(SeriesItemExtremesBackgroundFunctionTag value) {
        setEvent("background", value.getBody());
    }

    public void setSize(SeriesItemExtremesSizeFunctionTag value) {
        setEvent("size", value.getBody());
    }

    public void setType(SeriesItemExtremesTypeFunctionTag value) {
        setEvent("type", value.getBody());
    }

    public void setRotation(SeriesItemExtremesRotationFunctionTag value) {
        setEvent("rotation", value.getBody());
    }

    public java.lang.String getBackground() {
        return (java.lang.String)getProperty("background");
    }

    public void setBackground(java.lang.String value) {
        setProperty("background", value);
    }

    public String getBorder() {
        Function property = ((Function)getProperty("border"));
        if (property != null) {
            return property.getBody();
        }
        return null;
    }

    public void setBorder(String value) {
        setProperty("border", new Function(value));
    }

    public float getRotation() {
        return (Float)getProperty("rotation");
    }

    public void setRotation(float value) {
        setProperty("rotation", value);
    }

    public float getSize() {
        return (Float)getProperty("size");
    }

    public void setSize(float value) {
        setProperty("size", value);
    }

    public java.lang.String getType() {
        return (java.lang.String)getProperty("type");
    }

    public void setType(java.lang.String value) {
        setProperty("type", value);
    }

//<< Attributes

}
