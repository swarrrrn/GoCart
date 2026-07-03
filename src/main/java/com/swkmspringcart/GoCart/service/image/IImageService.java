package com.swkmspringcart.GoCart.service.image;

import com.swkmspringcart.GoCart.dto.ImageDto;
import com.swkmspringcart.GoCart.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
