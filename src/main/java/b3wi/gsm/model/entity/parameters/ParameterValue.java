package b3wi.gsm.model.entity.parameters;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import b3wi.gsm.model.ModelConstants;
import b3wi.gsm.model.entity.GSMEntity;

@Entity
@Table(name = "parameter_value")
public class ParameterValue extends GSMEntity
{
    private static final long serialVersionUID = -8362777667129089057L;

    @ManyToOne(optional = false)
    @JoinColumn(name = "parameter_id", nullable = false)
    private Parameter _parameter;

    @Column(name = "content", length = ModelConstants.TEXT_LENGHT, nullable = false)
    private String _content;

    public ParameterValue()
    {
        super();
    }

    public ParameterValue(Parameter parameter, String content)
    {
        super();
        _parameter = parameter;
        _content = content;
    }

    public String getContent()
    {
        return _content;
    }

    public Parameter getParameter()
    {
        return _parameter;
    }
}
