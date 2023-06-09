package ma.enset.springgestioncomptebancaire.mapper;

import ma.enset.springgestioncomptebancaire.dto.CompteRequestDTO;
import ma.enset.springgestioncomptebancaire.dto.CompteResponseDTO;
import ma.enset.springgestioncomptebancaire.entity.Compte;

public interface CompteMapper {
    public CompteResponseDTO fromBanqueCompte(Compte compte);
    public Compte fromCompteDTO(CompteRequestDTO compteRequestDTO);

}
