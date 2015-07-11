package b3wi.gsm.model.entity.common.history;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import b3wi.gsm.model.ModelConstants;
import b3wi.gsm.model.entity.GSMEntity;

@Entity
@Table(name = "t_log")
public class Log extends GSMEntity
{
    private static final long serialVersionUID = -7089217232387658305L;

    @Column(name = "c_log_time", nullable = false)
    private LocalDateTime _timestamp;

    @Column(name = "c_tag", length = ModelConstants.NAME_LENGHT, nullable = false)
    private String _tag;

    @ElementCollection
    @MapKeyColumn(name = "c_key", nullable = false)
    @Column(name = "c_content", length = ModelConstants.TEXT_LENGHT, nullable = false)
    @CollectionTable(name = "t_join_log_to_content")
    private Map<String, String> _content;

    public Log()
    {
        super();
    }

    public Log(LocalDateTime datetime, String tag, Map<String, String> content)
    {
        super();
        _timestamp = datetime;
        _tag = tag;
        _content = content;
    }

    public Map<String, String> getContent()
    {
        return _content;
    }

    public String getTag()
    {
        return _tag;
    }

    public LocalDateTime getTimestamp()
    {
        return _timestamp;
    }
}
