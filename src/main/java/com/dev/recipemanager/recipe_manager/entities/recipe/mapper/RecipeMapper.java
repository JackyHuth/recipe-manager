package com.dev.recipemanager.recipe_manager.entities.recipe.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dev.recipemanager.recipe_manager.entities.recipe.Recipe;
import com.dev.recipemanager.recipe_manager.entities.recipe.RecipeDTO;

@Mapper(componentModel = "spring")
public interface RecipeMapper {
    

    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    RecipeDTO recipeToRecipeDTO(Recipe recipe);
    Recipe recipeDTOToRecipe(RecipeDTO dto);

}
