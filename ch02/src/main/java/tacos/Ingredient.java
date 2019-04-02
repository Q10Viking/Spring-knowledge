package tacos;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data 
@RequiredArgsConstructor
public class Ingredient {
  
    @NonNull private final String id;
    @NonNull private final String name;
    @NonNull private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE  
    }
  
}