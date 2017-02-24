package com.laytonsmith.abstraction;

import java.util.List;

/**
 * @author jb_aero
 */
public interface MCBookMeta extends MCItemMeta {

    public boolean hasTitle();

    public boolean hasAuthor();

    public boolean hasPages();

    public String getTitle();

    public String getAuthor();

    public void setAuthor(String author);

    public List<String> getPages();

    public void setPages(String... pages);

    public int getPageCount();

    public void addPage(String... pages);

    public boolean setTitle(String title);

    public void setPages(List<String> pages);
}
