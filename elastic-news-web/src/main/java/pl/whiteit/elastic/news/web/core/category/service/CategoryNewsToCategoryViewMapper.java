package pl.whiteit.elastic.news.web.core.category.service;

import pl.whiteit.elastic.news.api.modules.news.model.CategoryView;
import pl.whiteit.elastic.news.common.enums.CategoryNews;

public class CategoryNewsToCategoryViewMapper {

    private CategoryNews categoryNews;

    private CategoryNewsToCategoryViewMapper (){

    }

    public static CategoryNewsToCategoryViewMapper create(){
        return new CategoryNewsToCategoryViewMapper();
    }

    public CategoryNewsToCategoryViewMapper categoryNews(CategoryNews categoryNews){
        this.categoryNews = categoryNews;
        return this;
    }

    public CategoryView map(){
        CategoryView categoryView = new CategoryView();
        categoryView.value = categoryNews.name();
        categoryView.name = categoryNews.getTrans();
        return categoryView;
    }
}
