package b3wi.gsm.model.entity.parameters;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import b3wi.gsm.model.ModelConstants;
import b3wi.gsm.model.entity.GSMEntity;

@Table(name = "parameter")
public class Parameter extends GSMEntity
{
    private static final long serialVersionUID = -7874240543861218508L;

    @Column(name = "name", length = ModelConstants.NAME_LENGHT, nullable = false, unique = true)
    private String _name;

    @Column(name = "description", length = ModelConstants.DESCRIPTION_LENGHT, nullable = false)
    private String _description;

    @Column(name = "regex", length = ModelConstants.REGEX_LENGHT, nullable = false)
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
