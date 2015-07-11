package b3wi.gsm.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class GSMEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id", nullable = false, unique = true)
    private long _identifier;

    public GSMEntity()
    {}

    public GSMEntity(long identifier)
    {
        _identifier = identifier;
    }

    public long getIdentifier()
    {
        return _identifier;
    }
}
