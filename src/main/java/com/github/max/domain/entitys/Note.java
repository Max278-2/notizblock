package com.github.max.domain.entitys;



public class Note {

private String _title;
private String _content;

public Note(String title)
{
    _title = title;
    _content = "";

}

public Note (String title, String content)
{
    _title = title;
    _content = content;
}

public String getTitel()
{
    return _title;
}

public String getContent()
{
    return _content;
}


}
