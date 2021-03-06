package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridColModelPojo implements Serializable {

    private String label;
    private String name;
    private String key;
    private String width;

    private boolean hidden = false;
    private boolean editable = false;

    @JsonProperty("edittype")
    private String editType; // text
    
    private boolean sortable = true;
    
    @JsonProperty("sorttype")
    private String sortType; // text
    
    @JsonRawValue
    private String formatter;
    
    private boolean search = false;
    
    @JsonProperty("stype")
    private String searchType;
    
    @JsonProperty("editoptions")
    private JqGridEditOptionPojo editOptions = new JqGridEditOptionPojo();

    @JsonProperty("searchoptions")
    private JqGridSearchOptionsPojo searchOptions = new JqGridSearchOptionsPojo();
    
    @JsonProperty("formatoptions")
    private JqGridFormatOptionsPojo formatOptions = new JqGridFormatOptionsPojo();

    public JqGridColModelPojo() {
    }
    
    public JqGridColModelPojo(String key, boolean hidden) {
        this.key = key;
        this.hidden = hidden;
    }
    
    public JqGridColModelPojo(String label, String name, String key, String width) {
        this.label = label;
        this.name = name;
        this.key = key;
        this.width = width;
    }
    
    public JqGridColModelPojo(String label, String name, String key, String width, String formatter) {
        this.label = label;
        this.name = name;
        this.key = key;
        this.width = width;
        this.formatter = formatter;
        this.sortable = false;
    }
    
    public JqGridColModelPojo(String label, String name, String key, String width, boolean search) {
        this.label = label;
        this.name = name;
        this.key = key;
        this.width = width;
        this.search = search;
    }
    
    public JqGridColModelPojo(String label, String name, String key, String width, boolean hidden, boolean editable, String editType, 
                              String sortType, String formatter, boolean search, String searchType) {
        this.label = label;
        this.name = name;
        this.key = key;
        this.width = width;
        this.hidden = hidden;
        this.editable = editable;
        this.editType = editType;
        this.sortType = sortType;
        this.formatter = formatter;
        this.search = search;
        this.searchType = searchType;
    }
    
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public boolean isEditable() {
		return editable;
	}

	public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getEditType() {
		return editType;
	}

	public void setEditType(String editType) {
		this.editType = editType;
	}
	
    public boolean isSortable() {
        return sortable;
    }

    public void setSortable(boolean sortable) {
        this.sortable = sortable;
    }
    
    public String getSortType() {
        if (sortType != null) {
            return sortType;
        }
        return "text";
    }
    
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	
	public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public String getSearchType() {
        if (searchType != null) {
            return searchType;
        }
        return "text";
    }
    
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }
    
    public JqGridEditOptionPojo getEditOptions() {
		return editOptions;
	}
	
	public void setEditOptions(JqGridEditOptionPojo editOptions) {
		this.editOptions = editOptions;
	}

	public JqGridSearchOptionsPojo getSearchOptions() {
		return searchOptions;
	}
	
	public void setSearchOptions(JqGridSearchOptionsPojo searchOptions) {
		this.searchOptions = searchOptions;
	}
	
	public JqGridFormatOptionsPojo getFormatOptions() {
		return formatOptions;
	}
	
	public void setFormatOptions(JqGridFormatOptionsPojo formatOptions) {
		this.formatOptions = formatOptions;
	}
	
}