package ru.runa.wf.web.ftl.component;

import ru.runa.wfe.commons.ftl.FormComponent;
import ru.runa.wfe.var.dto.RenderParameters;
import ru.runa.wfe.var.dto.RenderParameters.DisplayType;
import ru.runa.wfe.var.dto.WfVariable;

public class InputVariable extends FormComponent {
    private static final long serialVersionUID = 1L;

    @Override
    protected Object renderRequest() {
        RenderParameters renderParameters = new RenderParameters();
        String variableName = getParameterAsString(0);
        WfVariable variable = variableProvider.getVariableNotNull(variableName);
        String componentHtml = ViewUtil.getComponentInput(user, webHelper, variable, renderParameters);
        String tag = "span";
        if (renderParameters.getDisplayType().equals(DisplayType.BLOCK)) {
            tag = "div";
        }
        String html = "<" + tag + " class=\"inputVariable " + variable.getDefinition().getScriptingNameWithoutDots() + "\">";
        html += componentHtml;
        html += "</" + tag + ">";
        return html;
    }

}
