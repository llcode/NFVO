package org.project.neutrino.nfvo.core.api;

import org.project.neutrino.nfvo.catalogue.nfvo.VimInstance;
import org.project.neutrino.nfvo.repositories_interfaces.GenericRepository;
import org.project.neutrino.nfvo.vim_interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lto on 13/05/15.
 */
@Service
@Scope
public class VimManagement implements org.project.neutrino.nfvo.core.interfaces.VimManagement {
    @Autowired
    @Qualifier("vimRepository")
    private GenericRepository<VimInstance> vimInstanceGenericRepository;
    @Autowired
    private VimBroker<ImageManagement> imageManagementVimBroker;

    @Autowired
    private VimBroker<org.project.neutrino.nfvo.vim_interfaces.NetworkManagement> networkManagementVimBroker;


    @Override
    public VimInstance add(VimInstance vimInstance) {
        this.refresh(vimInstance);
        return vimInstanceGenericRepository.create(vimInstance);
    }

    @Override
    public void delete(String id) {
        vimInstanceGenericRepository.remove(vimInstanceGenericRepository.find(id));
    }

    @Override
    public VimInstance update(VimInstance new_vimInstance, String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<VimInstance> query() {
        return vimInstanceGenericRepository.findAll();
    }

    @Override
    public VimInstance query(String id) {
        return vimInstanceGenericRepository.find(id);
    }

    @Override
    public void refresh(VimInstance vimInstance) {
        vimInstance.setImages(imageManagementVimBroker.getVim(vimInstance.getType()).queryImages(vimInstance));
        vimInstance.setNetworks(networkManagementVimBroker.getVim(vimInstance.getType()).queryNetwork(vimInstance));
    }
}