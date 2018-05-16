package pl.whiteit.elastic.news.web.core.category.service;

import pl.whiteit.elastic.news.api.modules.news.model.CategoryView;
import pl.whiteit.elastic.news.common.enums.CategoryNews;
import pl.whiteit.elastic.news.web.core.category.mapper.CategoryNewsToCategoryViewMapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {

    public List<CategoryView> getAll(){
        CategoryNewsToCategoryViewMapper categoryViewMapper = CategoryNewsToCategoryViewMapper.create();
        return Arrays.stream(CategoryNews.values()).map(categoryNews -> categoryViewMapper.categoryNews(categoryNews).map()).collect(Collectors.toList());
    }
}
