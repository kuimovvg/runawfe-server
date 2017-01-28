package ru.runa.wfe.var.format;

import ru.runa.wfe.commons.web.WebHelper;
import ru.runa.wfe.user.User;
import ru.runa.wfe.var.dto.RenderParameters;
import ru.runa.wfe.var.dto.RenderParameters.DisplayType;

/**
 * Text format for string representable as text areas.
 * 
 * @author dofs
 * @since 4.0
 */
public class TextFormat extends StringFormat implements VariableDisplaySupport {

    @Override
    public String getName() {
        return "text";
    }

    @Override
    public String formatHtml(User user, WebHelper webHelper, Long processId, String name, Object object, RenderParameters renderParameters) {
        renderParameters.setDisplayType(DisplayType.INLINE);
        return (String) object;
    }

}
