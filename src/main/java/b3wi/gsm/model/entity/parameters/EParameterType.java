package b3wi.gsm.model.entity.parameters;

import java.util.regex.Pattern;

public enum EParameterType
{
    // String generic
    STRING(".*"),
    // Positive integer
    INTEGER("[0-9]*"),
    // IP v4
    IP("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"),
    // Port number
    PORT("^([0-9]{1,4}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$");

    private Pattern _regex;

    private EParameterType(String regex)
    {
        _regex = Pattern.compile(regex);
    }

    public Pattern getRegex()
    {
        return _regex;
    }
}
