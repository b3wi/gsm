package b3wi.gsm.model.entity.common.parameter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import b3wi.gsm.model.ModelConstants;
import b3wi.gsm.model.entity.GSMEntity;

@Table(name = "t_parameter")
public class Parameter extends GSMEntity
{
    private static final long serialVersionUID = -7874240543861218508L;

    @Column(name = "c_name", length = ModelConstants.NAME_LENGHT, nullable = false, unique = true)
    private String _name;

    @Column(name = "c_description", length = ModelConstants.DESCRIPTION_LENGHT, nullable = false)
    private String _description;

    @Column(name = "c_regex", length = ModelConstants.REGEX_LENGHT, nullable = false)
    private String _regex;

    @Enumerated(EnumType.STRING)
    private EParameterType _type;

    public Parameter()
    {
        super();
    }

    public Parameter(String name, String description, String regex, EParameterType type)
    {
        super();
        _name = name;
        _description = description;
        _regex = regex;
        _type = type;
    }

    public String getDescription()
    {
        return _description;
    }

    public String getName()
    {
        return _name;
    }

    public String getRegex()
    {
        return _regex;
    }

    public EParameterType getType()
    {
        return _type;
    }
}
