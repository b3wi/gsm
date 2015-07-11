package b3wi.gsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import b3wi.gsm.model.ModelConstants;

@Entity
@Table(name = "t_server")
public class Server extends GSMEntity
{
    private static final long serialVersionUID = -3004824190257700130L;

    @Column(name = "c_name", length = ModelConstants.NAME_LENGHT)
    private String _name;

    public Server()
    {
        super();
    }

    public Server(String name)
    {
        super();
        _name = name;
    }

    public String getName()
    {
        return _name;
    }
}
